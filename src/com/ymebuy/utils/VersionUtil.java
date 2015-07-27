package com.ymebuy.utils;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/**
 * 类名：VersionUtils.java 类描述：版本工具，用于获取程序版本号、版本名称和版本检测
 * 
 * @author 吴金宏 2015年7月25日 上午10:58:46
 * 
 */
public class VersionUtil {

	/**
	 * 程序包名
	 */
	private final static String PACKAGE_NAME = "com.ymebuy";

	/**
	 * 获取当前程序版本号
	 * 
	 * @author 吴金宏 2015年7月25日 上午11:00:05
	 * @param context
	 * @return
	 */
	public static int getCurrentVersionCode(Context context) {
		try {
			return context.getPackageManager().getPackageInfo(PACKAGE_NAME, 0).versionCode;
		} catch (NameNotFoundException e) {
			return -1;
		}
	}

	/**
	 * 获取当前程序版本名称
	 * 
	 * @author 吴金宏 2015年7月25日 上午11:00:35
	 * @param context
	 * @return
	 */
	public static String getCurrentVersionName(Context context) {
		try {
			return context.getPackageManager().getPackageInfo(PACKAGE_NAME, 0).versionName;
		} catch (NameNotFoundException e) {
			return "";
		}
	}

	/**
	 * 根据版本名判断得到的版本号是否为新版本，根据VersionName比较
	 * 
	 * @author 吴金宏 2015年7月25日 上午11:00:51
	 * @param versionName
	 *            得到的版本号
	 * @param currentVersionName
	 *            当前版本号
	 * @return true：获取到的版本是新版本；false：获取到的版本不是新版本
	 */
	public static boolean isNewVersion(String versionName,
			String currentVersionName) {
		return versionName.compareToIgnoreCase(currentVersionName) > 0;
	}

	/**
	 * 根据版本号判断得到的版本号是否为新版本，根据VersionCode比较
	 * 
	 * @author 吴金宏 2015年7月25日 上午11:01:32
	 * @param versionCode
	 *            得到的版本号
	 * @param currentVersionCode
	 *            当前版本号
	 * @return true：获取到的版本是新版本；false：获取到的版本不是新版本
	 */
	public static boolean isNewVersion(int versionCode, int currentVersionCode) {
		return versionCode > currentVersionCode;

	}

}
