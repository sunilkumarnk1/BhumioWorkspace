package com.bhumio.workspace.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRun implements IRetryAnalyzer {
    private int minRetryCnt = 0;
    private int max_RetryCnt = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (!result.isSuccess()){
            if(minRetryCnt<max_RetryCnt){
                minRetryCnt++;
                result.setStatus(ITestResult.FAILURE);
                return true;
            }else{
                result.setStatus(ITestResult.FAILURE);
            }
        }else{
            result.setStatus(ITestResult.SUCCESS);
        }
            return false;
    }
}
