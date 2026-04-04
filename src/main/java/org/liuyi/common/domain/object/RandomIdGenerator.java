package org.liuyi.common.domain.object;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class RandomIdGenerator {
    private static final Snowflake SNOWFLAKE = IdUtil.getSnowflake();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int BASE = ALPHABET.length();

    /**
     * 生成字符串主键（直接可用）
     */
    public static String generate() {
        long numericId = SNOWFLAKE.nextId();
        return encodeBase62(numericId);
    }

    /**
     * 数字转 Base62 短字符串
     */
    private static String encodeBase62(long num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(ALPHABET.charAt((int)(num % BASE)));
            num /= BASE;
        }
        return sb.reverse().toString();
    }

    /**
     * 从短字符串还原数字（如果需要）
     */
    public static long decodeBase62(String str) {
        long num = 0;
        for (char c : str.toCharArray()) {
            num = num * BASE + ALPHABET.indexOf(c);
        }
        return num;
    }

    // 使用示例
    public static void main(String[] args) {
        String id = generate();
        System.out.println(id);  // 输出类似 "2cVj9a"
        // 长度通常在 6-10 位，远短于 UUID
    }
}