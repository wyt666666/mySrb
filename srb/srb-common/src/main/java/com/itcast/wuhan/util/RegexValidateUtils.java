package com.itcast.wuhan.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 使用正则表达式进行表单验证
 */
public class RegexValidateUtils {

    static boolean flag = false;
    static String regex = "";

    public static boolean check(String str, String regex) {
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 验证邮箱
     *
     * @param email
     * @return
     */
    public static boolean checkEmail(String email) {
        String regex = "/^1(3\\d|4[5-9]|5[0-35-9]|6[2567]|7[0-8]|8\\d|9[0-35-9])\\d{8}$/";
        return check(email, regex);
    }

    /**
     * 验证手机号码(网上搜索最新版)
     * @param cellphone
     * @return
     */
    public static boolean checkCellphone(String cellphone) {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
        return check(cellphone, regex);
    }

    /**
     * 验证固话号码
     *
     * @param telephone
     * @return
     */
    public static boolean checkTelephone(String telephone) {
        String regex = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
        return  check(telephone, regex);
    }

    /**
     * 验证传真号码
     *
     * @param fax
     * @return
     */
    public static boolean checkFax(String fax) {
        String regex = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
        return check(fax, regex);
    }

    /**
     * 验证QQ号码
     *
     * @param QQ
     * @return
     */
    public static boolean checkQQ(String QQ) {
        String regex = "^[1-9][0-9]{4,} $";
        return check(QQ, regex);
    }
}
