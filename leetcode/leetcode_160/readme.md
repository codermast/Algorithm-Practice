## 1. 暴力匹配

两层循环，进行对应匹配即可，类似于数组中的匹配。

具体过程：A 每次向后走一步，B 走全程进行匹配。

## 2. 借助栈从后向前遍历法

根据题目所说的两个链表如果相交的话，那么从相交位置向后开始遍历，则到链表末尾的距离是相等的。

从这里其实可以很简单的想到，可以从后开始往前遍历两个链表，遍历到最后一个相等的结点时，这个结点就是两个链表相交的结点。

由于这里给的是单链表，所以没法直接从链表末尾向前遍历，需要将遍历的结点进行存储。

1. 创建两个栈，用于存储两个链表的结点信息，创建返回节点变量 ret 初始值为 null
2. 每次弹出两个栈的栈顶元素，进行匹配，匹配成功则更新返回节点的值
3. 当其中一个栈为空时，遍历结束，返回 ret

时间复杂度：O(m+n)
空间复杂度：O(max(m,n))

## 3. 双指针

双指针的方法就是对方法2的一些优化，核心思想还是一致的，就是从相交节点开始，向后的所有节点都是相同的。

简单来说，就是让 指针a 走完 链表A+链表B，让指针b 走完 链表B+链表A，此时走到最后的步数都是两个链表的长度，即 m+n。

即最后走到相同节点上时，即为交叉节点。