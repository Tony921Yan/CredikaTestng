package com.meiji.com.report

import com.meiji.util.DateUtil
import com.meiji.util.ResourceUtil
import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.app.Velocity
import org.apache.velocity.app.VelocityEngine
import org.testng.IReporter
import org.testng.IResultMap
import org.testng.ISuite
import org.testng.ISuiteResult
import org.testng.ITestContext
import org.testng.ITestResult
import org.testng.xml.XmlSuite

class GenerateReporter  implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        // TODO Auto-generated method stub
        try {
            // 初始化并取得Velocity引擎
            VelocityEngine velocityEngine = new VelocityEngine();
            Properties properties = new Properties();
            properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, ResourceUtil.getSourcePath());
            properties.setProperty(Velocity.INPUT_ENCODING, "UTF-8")
            velocityEngine.init(properties);

            Template template = velocityEngine.getTemplate("reportTemplate.html");
            VelocityContext context = new VelocityContext();

            for (ISuite suite : suites) {
                Map<String, ISuiteResult> suiteResults = suite.getResults();
                for (ISuiteResult suiteResult : suiteResults.values()) {
                    ReporterData data = new ReporterData();
                    ITestContext testContext = suiteResult.getTestContext();
                    // 把数据填入上下文
                    context.put("overView", data.testContext(testContext));//测试结果汇总信息
                    IResultMap passedTests = testContext.getPassedTests();//测试通过的测试方法
                    IResultMap failedTests = testContext.getFailedTests();//测试失败的测试方法
                    IResultMap skippedTests = testContext.getSkippedTests();//测试跳过的测试方法

                    context.put("pass", data.testResults(passedTests, ITestResult.SUCCESS));
                    context.put("fail", data.testResults(failedTests, ITestResult.FAILURE));
                    context.put("skip", data.testResults(skippedTests, ITestResult.FAILURE));
                    context.put("time", DateUtil.dateToStr(new Date()))

                }
            }
            // 输出流
            OutputStream out = new FileOutputStream("report.html");
            Writer writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"))
            // 转换输出
            template.merge(context, writer);
            //System.out.println(writer.toString());
            writer.flush();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
