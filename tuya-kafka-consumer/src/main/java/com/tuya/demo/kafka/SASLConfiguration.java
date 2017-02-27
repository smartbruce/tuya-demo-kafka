
package com.tuya.demo.kafka;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class SASLConfiguration extends Configuration {

	public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
		Map<String, String> options = new HashMap<String, String>();
		options.put("username", "");
		options.put("password", "");
		AppConfigurationEntry entry = new AppConfigurationEntry(
				"org.apache.kafka.common.security.plain.PlainLoginModule",
				AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, options);
		AppConfigurationEntry[] configurationEntries = new AppConfigurationEntry[1];
		configurationEntries[0] = entry;
		return configurationEntries;
	}
}
