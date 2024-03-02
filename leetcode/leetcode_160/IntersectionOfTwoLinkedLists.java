package leetcode_160;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// leetcode 160. 相交链表
public class IntersectionOfTwoLinkedLists {
    // 暴力求解
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for (ListNode a = headA; a != null; a = a.next) {
            for (ListNode b = headB; b != null; b = b.next) {
                if (a == b) {
                    return a;
                }
            }
        }
        return null;
    }

    // 借助栈从后向前遍历法
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();

        Stack<ListNode> stackB = new Stack<>();

        // 将 链表A 压栈
        for (ListNode a = headA; a != null; a = a.next) {
            stackA.push(a);
        }
        // 将 链表B 压栈
        for (ListNode b = headB; b != null; b = b.next) {
            stackB.push(b);
        }
        ListNode ret = null;

        // 必须保证两个栈都不为空
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            ListNode aPop = stackA.pop();
            ListNode bPop = stackB.pop();

            if (aPop == bPop) {
                ret = aPop;
            }
        }
        return ret;
    }

    // 双指针
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != null && b != null) {
            // 判断两个节点是否相同，如果相同则说明该节点为交叉点
            if (a == b) {
                return a;
            }
            // 不相同时：则将a、b指针均向后移动一位
            a = a.next;
            b = b.next;

            if (a == null && b == null) {
                break;
            }

            // 指针a走到尽头时，便让其从 链表B 的表头开始
            if (a == null) {
                a = headB;
            }

            // 指针b走到尽头时，便让其从 链表A 的表头开始
            if (b == null) {
                b = headA;
            }
        }
        // 没有相同的结点，则说明不交叉，返回null即可
        return null;
    }
}
