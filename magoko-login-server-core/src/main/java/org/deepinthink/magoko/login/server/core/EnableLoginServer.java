package org.deepinthink.magoko.login.server.core;

import org.deepinthink.magoko.login.server.core.config.LoginServerEnableMarkerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import(LoginServerEnableMarkerConfiguration.class)
public @interface EnableLoginServer {}
