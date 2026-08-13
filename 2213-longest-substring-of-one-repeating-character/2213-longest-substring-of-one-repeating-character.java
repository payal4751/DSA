class Solution {

    class Node {
        int len;
        int pLen;
        int sLen;
        int maxLen;
        char leftChar;
        char rightChar;
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {

        int n = s.length();
        arr = s.toCharArray();
        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int k = queryIndices.length;
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            update(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
            ans[i] = tree[1].maxLen;
        }

        return ans;
    }

    private void build(int idx, int l, int r) {

        tree[idx] = new Node();

        if (l == r) {
            Node node = tree[idx];
            node.len = 1;
            node.pLen = 1;
            node.sLen = 1;
            node.maxLen = 1;
            node.leftChar = arr[l];
            node.rightChar = arr[l];
            return;
        }

        int mid = (l + r) / 2;

        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);

        tree[idx] = merge(tree[idx * 2], tree[idx * 2 + 1]);
    }

    private void update(int idx, int l, int r, int pos, char ch) {

        if (l == r) {
            arr[pos] = ch;
            Node node = tree[idx];
            node.leftChar = ch;
            node.rightChar = ch;
            node.pLen = 1;
            node.sLen = 1;
            node.maxLen = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (pos <= mid)
            update(idx * 2, l, mid, pos, ch);
        else
            update(idx * 2 + 1, mid + 1, r, pos, ch);

        tree[idx] = merge(tree[idx * 2], tree[idx * 2 + 1]);
    }

    private Node merge(Node a, Node b) {

        Node res = new Node();

        res.len = a.len + b.len;

        res.leftChar = a.leftChar;
        res.rightChar = b.rightChar;

        res.pLen = a.pLen;
        if (a.pLen == a.len && a.rightChar == b.leftChar)
            res.pLen = a.len + b.pLen;

        res.sLen = b.sLen;
        if (b.sLen == b.len && a.rightChar == b.leftChar)
            res.sLen = b.len + a.sLen;

        res.maxLen = Math.max(a.maxLen, b.maxLen);

        if (a.rightChar == b.leftChar)
            res.maxLen = Math.max(res.maxLen, a.sLen + b.pLen);

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna