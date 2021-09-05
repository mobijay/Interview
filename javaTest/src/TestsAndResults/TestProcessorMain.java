package TestsAndResults;

public class TestProcessorMain {

    public static void main(String[] args) {
        /* Rerun the tests from testResults that are failed, do not have a result and were missing from allTests */
        String allTests =
                "pkg1.class1.test1\n" +
                        "pkg1.class1.test2\n" +
                        "pkg1.class1.test3\n" +
                        "pkg1.class2.test1\n" +
                        "pkg1.class2.test2\n" +
                        "pkg2.class1.test1\n" +
                        "pkg2.class2.test1\n" +
                        "pkg3.class1.test1\n" +
                        "pkg3.class1.test2\n" +
                        "pkg1.class1.test3";

        String testResults =
                "pkg1:class1:test1:passed\n" +
                        "pkg1:class1:test2:failed\n" +
                        "pkg1:class2:test1:passed\n" +
                        "pkg1:class2:test2:failed\n" +
                        "Pkg3:class1:test3:";

        TestProcessor testProcessor = new TestProcessor();
        System.out.println(testProcessor.testToExecute(allTests, testResults));
    }
}
