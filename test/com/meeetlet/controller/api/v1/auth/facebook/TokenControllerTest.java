package com.meeetlet.controller.api.v1.auth.facebook;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import com.meeetlet.controller.api.v1.auth.facebook.TokenController;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TokenControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/api/v1/auth/token");
        TokenController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
