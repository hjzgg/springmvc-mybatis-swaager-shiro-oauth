package com.hjzgg.common.util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数据校验
 */
public class DataValidator {
	/**
	 * 是否是整数
	 * 
	 * @param value
	 */
	public static boolean isIntege(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^-?[1-9]\\d*$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是正整数
	 * 
	 * @param value
	 */
	public static boolean isPositiveIntege(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1-9]\\d*$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是负整数
	 * 
	 * @param value
	 */
	public static boolean isNegtiveIntege(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^-[1-9]\\d*$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是正数（正整数 + 0）
	 * 
	 * @param value
	 */
	public static boolean isPositiveNum(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1-9]\\d*|0$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是负数（负整数 + 0）
	 * 
	 * @param value
	 */
	public static boolean isNegtiveNum(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^-[1-9]\\d*|0$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是数字
	 * 
	 * @param value
	 */
	public static boolean isNum(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^([+-]?)\\d*\\.?\\d+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是浮点数
	 * 
	 * @param value
	 */
	public static boolean isDecmal(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^([+-]?)\\d*\\.\\d+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是正浮点数
	 * 
	 * @param value
	 */
	public static boolean isDecmal1(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是负浮点数
	 * 
	 * @param value
	 */
	public static boolean isDecmal2(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*)$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是浮点数
	 * 
	 * @param value
	 */
	public static boolean isDecmal3(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^-?([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|0?.0+|0)$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是非负浮点数（正浮点数 + 0）
	 * 
	 * @param value
	 */
	public static boolean isDecmal4(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|0?.0+|0$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是非正浮点数（负浮点数 + 0）
	 * 
	 * @param value
	 */
	public static boolean isDecmal5(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^(-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*))|0?.0+|0$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是中文
	 * 
	 * @param value
	 */
	public static boolean isChinese(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是ACSII字符
	 * 
	 * @param value
	 */
	public static boolean isAscii(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[\\x00-\\xFF]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是邮件
	 * 
	 * @param value
	 */
	public static boolean isEmail(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是邮编
	 * 
	 * @param value
	 */
	public static boolean isZipcode(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^\\d{6}$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是QQ号码
	 * 
	 * @param value
	 */
	public static boolean isQq(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1-9]*[1-9][0-9]*$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是手机
	 * 
	 * @param value
	 */
	public static boolean isMobile(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是电话号码的函数(包括验证国内区号,国际区号,分机号)
	 * 
	 * @param value
	 */
	public static boolean isTel(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	public static boolean isPhone(String str) {
		Pattern p1 = null, p2 = null;
		Matcher m = null;
		boolean b = false;
		p1 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$"); // 验证带区号的
		p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$"); // 验证没有区号的
		if (str.length() > 9) {
			m = p1.matcher(str);
			b = m.matches();
		} else {
			m = p2.matcher(str);
			b = m.matches();
		}
		return b;
	}

	/**
	 * 是否是url
	 * 
	 * @param value
	 */
	public static boolean isUrl(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^http[s]?:\\/\\/([\\w-]+\\.)+[\\w-]+([\\w-./?%&=]*)?$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是ip地址
	 * 
	 * @param value
	 */
	public static boolean isIp(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile(
				"^(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是非空
	 * 
	 * @param value
	 */
	public static boolean isNotempty(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^\\S+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是颜色
	 * 
	 * @param value
	 */
	public static boolean isColor(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[a-fA-F0-9]{6}$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是图片
	 * 
	 * @param value
	 */
	public static boolean isPicture(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("(.*)\\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是压缩文件
	 * 
	 * @param value
	 */
	public static boolean isRar(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("(.*)\\.(rar|zip|7zip|tgz)$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是日期
	 * 
	 * @param value
	 */
	public static boolean isDate(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile(
				"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 验证姓名有效性，需要考虑支持少数民族的人名，或者外国人的中译名，例如：阿沛·阿旺晋美、卡尔·马克思等
	 * @param str
	 * @return
	 */
	public static boolean isName(String str) {   
        Pattern p = null;
        Matcher m = null;  
        boolean b = false;    
        p = Pattern.compile("[\u4E00-\u9FA5]{2,5}(?:·[\u4E00-\u9FA5]{2,5})*"); 
        m = p.matcher(str);  
        b = m.matches();    
        return b;  
    }  
    
	/**
	 * 用来用户注册。匹配由数字、26个英文字母或者下划线组成的字符串
	 * 
	 * @param value
	 */
	public static boolean isUsername(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^\\w+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是字母
	 * 
	 * @param value
	 */
	public static boolean isLetter(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[A-Za-z]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是大写字母
	 * 
	 * @param value
	 */
	public static boolean isLetter_u(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[A-Z]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是大写字母
	 * 
	 * @param value
	 */
	public static boolean isLetter_l(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^[a-z]+$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	/**
	 * 是否是价格
	 * 
	 * @param value
	 */
	public static boolean isPrice(String value) {
		Pattern p = null;// 正则表达式
		Matcher m = null;// 操作符表达式
		boolean b = false;
		p = Pattern.compile("^([1-9]{1}[0-9]{0,}(\\.[0-9]{0,2})?|0(\\.[0-9]{0,2})?|\\.[0-9]{1,2})$");
		m = p.matcher(value);
		b = m.matches();
		return b;
	}

	public static void main(String[] args) {
		boolean b = DataValidator.isPositiveIntege("1234143");
		System.out.println(b);
	}
}
