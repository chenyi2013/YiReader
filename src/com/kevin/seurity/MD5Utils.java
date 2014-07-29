package com.kevin.seurity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密算法
 * 
 * @author Kevin
 * 
 */
public class MD5Utils {
	public String getMD5(byte[] source) {
		String encryptResult = null;
		// 用来将字节转换成16进制表示的字符
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(source);
			// MD5的计算结果是一个128位的长整数，用字节表示为16个字节
			byte[] tmp = messageDigest.digest();
			// 每个字节用16进制表示的话，使用2个字符(高4位一个,低4位一个)，所以表示成16进制需要32个字符
			char[] result = new char[16 * 2];
			int k = 0;// 转换结果中对应的字符位置

			for (int i = 0; i < 16; i++) {// 对MD5的每一个字节转换成16进制字符
				byte b = tmp[i];
				result[k++] = hexDigits[b >>> 4 & 0xf];// 对字节高4位进行16进制转换
				result[k++] = hexDigits[b & 0xf]; // 对字节低4位进行16进制转换

			}

			encryptResult = new String(result);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return encryptResult;
	}
}
