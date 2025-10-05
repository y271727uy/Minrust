package org.tab.minrust;

/**
 * Rust工具箱接口，供第三方开发者调用
 * 提供高性能Rust接口，安装mod即启用
 * Rust崩溃或panic的风险由调用者承担
 */
public interface IRustToolbox {
    
    /**
     * 获取Rust工具箱实例
     * @return IRustToolbox实例
     */
    static IRustToolbox getInstance() {
        return RustToolboxImpl.getInstance();
    }
    
    /**
     * 计算两个整数的和
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 两个整数的和
     */
    int add(int a, int b);
    
    /**
     * 处理字符串数据
     * @param input 输入字符串
     * @return 处理后的字符串
     */
    String processString(String input);
    
    /**
     * 调用可能panic的Rust函数
     * @param shouldPanic 是否触发panic
     */
    void mightPanic(boolean shouldPanic);
}