# Leetcode 1646. 获取生成数组中的最大值 - 模拟法直接进行循环

## 题目地址
[1646. 获取生成数组中的最大值](https://leetcode-cn.com/problems/get-maximum-in-generated-array/)

## 题目信息
给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：

nums[0] = 0
nums[1] = 1
当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
返回生成数组 nums 中的 最大 值。

 

示例 1：

输入：n = 7
输出：3
解释：根据规则：
nums[0] = 0
nums[1] = 1
nums[(1 * 2) = 2] = nums[1] = 1
nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
nums[(2 * 2) = 4] = nums[2] = 1
nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
nums[(3 * 2) = 6] = nums[3] = 2
nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
因此，nums = [0,1,1,2,1,3,2,3]，最大值 3
示例 2：

输入：n = 2
输出：1
解释：根据规则，nums[0]、nums[1] 和 nums[2] 之中的最大值是 1
示例 3：

输入：n = 3
输出：2
解释：根据规则，nums[0]、nums[1]、nums[2] 和 nums[3] 之中的最大值是 2


提示：

0 <= n <= 100

## 解题思路
&emsp;&emsp;题目中已经给定了nums数组的两个初始值，并且给定了相关的递推公式，我们直接在一层for循环中进行模拟填数，直接将数组的数据填写。

## 代码
### 方法1️⃣：模拟法
```java
    public int getMaximumGenerated(int n) {
        if(n == 0){
            return 0;
        }
        // 定义所需填充数组
        int[] nums = new int[n + 1];
        
        // 初始化默认值
        nums[0] = 0;
        nums[1] = 1;
        
        // 记录最大值
        int max = nums[0];
        
        // 循环遍历
        for (int i = 0;i <= n;i++){
            if (2 <= 2 * i && 2 * i <= n){
                nums[2 * i] = nums[i];
            }

            if (2 <= 2 * i + 1 && 2 * i + 1 <= n){
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }

            max = Math.max(max,nums[i]);
        }
        return max;
    }
```
### 复杂度分析
- 时间复杂度：O(n)
- 空间复杂度：O(n)