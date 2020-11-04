package com.twinkle.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ABMS - SSM
 * <p>这个类的作用是对用户的密码进行加密处理</p>
 * <p>加密算法使用 MD5</p>
 *
 * @author Twinkle
 * @version 1.0.0
 * @since 4 Nov. 2020
 */
public class PasswordEncodeUtils {
    //十六进制下数字到字符的映射数组
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /**
     * 加密输入的字符串
     *
     * @param inputString 输入的字符串
     * @return 加密的字符串
     */
    public static String generatePassword(String inputString) {
        return encodeByMD5(inputString);
    }

    /**
     * 验证输入的字符串
     *
     * @param password    加密后的密码
     * @param inputString 输入的字符串
     * @return 验证结果（布尔值）
     */
    public static boolean validatePassword(String password, String inputString) {
        return password.equals(encodeByMD5(inputString));
    }

    /**
     * 对字符串进行 MD5 加密
     *
     * @param originString 源字符串
     * @return 加密后的字符串
     * @see NoSuchAlgorithmException
     */
    private static String encodeByMD5(String originString) {
        if (originString != null) {
            MessageDigest messageDigest;
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                byte[] results = messageDigest.digest(originString.getBytes());
                String resultString = byteArrayToHexString(results);
                return resultString.toUpperCase();
            } catch (NoSuchAlgorithmException | NullPointerException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 将字节数组转化为十六进制形式的字符串
     * 参数传入字节数组
     *
     * @param b 字节数组
     * @return 十六进制形式的字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte value : b) {
            stringBuilder.append(byteToHexString(value));
        }
        return stringBuilder.toString();
    }

    /**
     * 将单个字节转化为十六进制形式的字符串
     *
     * @param b 单个字节
     * @return 十六进制形式的单个字节
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}
