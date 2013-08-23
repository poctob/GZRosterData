package com.xpresstek.gzrosterdata.test.data;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DataManagerTest.class, DutyTest.class, PersonTest.class,
		PositionTest.class, PrivilegeTest.class, TimeOffTest.class,
		UploadManagerTest.class })
public class AllTests {

}
