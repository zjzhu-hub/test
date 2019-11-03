package com.zzj.util;

import javax.swing.JOptionPane;

import cn.hutool.core.util.NetUtil;

public class ActiveMQUtil {

	public static void main(String[] args) {
		checkServer();
	}
	public static void checkServer() {
		if(NetUtil.isUsableLocalPort(8161)) {
			JOptionPane.showMessageDialog(null, "ActiveMQ 服务器未启动 ");
			System.exit(1);
		} 
	}
}
