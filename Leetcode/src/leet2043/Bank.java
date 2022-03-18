package leet2043;

public class Bank {
    long[] balance;
    int size;

    // 初始化账户
    public Bank(long[] balance) {
        this.balance = balance;
        this.size = balance.length;
    }

    // 转账
    public boolean transfer(int account1, int account2, long money) {
        if (account1 <= size && account1 > 0 && account2 <= size && account2 > 0 && balance[account1 - 1] >= money) {
            balance[account2 - 1] += money;
            balance[account1 - 1] -= money;
            return true;
        }
        return false;
    }

    // 存款
    public boolean deposit(int account, long money) {
        if (account <= size && account > 0) {
            balance[account - 1] += money;
            return true;
        }
        return false;
    }

    // 取款
    public boolean withdraw(int account, long money) {
        if (account <= size && account > 0 && balance[account - 1] >= money) {
            balance[account - 1] -= money;
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
