package org.eightychars.sandbox.spring_boot_filters;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SuppressWarnings("unchecked")
public class SpringBootAppTest
{
    static Logger logger = LoggerFactory.getLogger(SpringBootAppTest.class);

    @BeforeEach
    public void init(TestInfo testInfo)
    {
        logger.info("----> test started: {}", testInfo.getDisplayName());
    }

    @AfterEach()
    public void cleanup(TestInfo testInfo)
    {
        logger.info("<---- test finished: {}", testInfo.getDisplayName());
    }

    /**
     */
    @Test
    public void basic()
    {
;
    }

}
