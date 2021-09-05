package TestsAndResults;

import java.util.HashMap;
import java.util.Map;

public class TestProcessor {

    public String testToExecute(String allTests, String testResults) {

        String testsToRerun = "";

        Map<String, String> historyOfTestsAlreadyRun = new HashMap<>();
        String[] testResultsArray = testResults.split("\n");
        for(int i=0; i<testResultsArray.length; i++) {
            String testResult = testResultsArray[i];
            testResult = testResult.replaceAll(":", ".");

            int lastIndexOfColon = testResult.lastIndexOf(".");
            String resultPackageClassTest = testResult.substring(0, lastIndexOfColon);
            String resultTestReults = testResult.substring(lastIndexOfColon + 1, testResult.length());

            historyOfTestsAlreadyRun.put(resultPackageClassTest, resultTestReults);
        }


        String[] allTestsArray = allTests.split("\n");
        for(int i=0; i < allTestsArray.length; i++) {
            String test = allTestsArray[i];
            //Tests that we want to rerun
            if(!historyOfTestsAlreadyRun.containsKey(test)) {
                testsToRerun += test + "\n";
            } else {
                String testResult = historyOfTestsAlreadyRun.get(test);
                if(testResult.equalsIgnoreCase("failed") || testResult.equalsIgnoreCase("")) {
                    testsToRerun += test + "\n";
                }
                System.out.println();
            }

        }
        return testsToRerun;
    }
}
