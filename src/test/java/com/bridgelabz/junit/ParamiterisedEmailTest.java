package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamiterisedEmailTest {
    private String email2Test;
    private boolean expectedResult;

    public ParamiterisedEmailTest(String email2Test, boolean expectedResult) {
        this.email2Test = email2Test;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.aa.au", false}});
    }
    @Test
    public void givenEmailAsVariable_ShouldReturnAsPerTheParameterisedResult() {
       UserValidate validator = new UserValidate();
        Assert.assertEquals(this.expectedResult, validator.emailValidator(this.email2Test));
    }
}
