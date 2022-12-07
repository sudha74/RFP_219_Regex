package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

    private final String email;
    private final String expectedResult;
    private UserRegistration read;

    public UserRegistrationParameterizedTest(String email, String expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init() {
        read = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection emailInput() {
        return Arrays
                .asList(new Object[][]{{"sudha@@yahoo.com", "InValid"}, {"abc.xyz@bl.co.india", "InValid"},
                        {"abc.xyz$bl.co.in", "InValid"}, {"abc.xyz@bl.co.in", "Valid"}});
    }

    @Test
    public void testEmail() throws UserRegistrationException {
        assertEquals(expectedResult, read.validEmailId.validate(email));
    }
}