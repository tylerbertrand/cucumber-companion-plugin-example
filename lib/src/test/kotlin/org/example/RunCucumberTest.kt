package org.example

import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

@SelectClasspathResource("features")
@Suite
class RunCucumberTest {
}