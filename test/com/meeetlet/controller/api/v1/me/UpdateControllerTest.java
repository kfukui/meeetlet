package com.meeetlet.controller.api.v1.me;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import com.meeetlet.controller.api.v1.me.UpdateController;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UpdateControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/api/v1/me/update");
        UpdateController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
