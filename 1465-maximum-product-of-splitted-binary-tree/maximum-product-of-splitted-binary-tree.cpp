/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void calculateSum(TreeNode* root, int &sum){
        if (root == NULL){
            return;
        }
        sum += root->val;
        calculateSum(root->left, sum);
        calculateSum(root->right, sum);
    }
    int solve(TreeNode* root, long long int &maxProduct, int totalSum){
        if (root == NULL){
            return 0;
        }
        int subTree = root->val;
        subTree += solve(root->left, maxProduct, totalSum);
        subTree += solve(root->right, maxProduct, totalSum);
        maxProduct = max(maxProduct, subTree * 1LL * (totalSum - subTree));
        return subTree;
    }
    int maxProduct(TreeNode* root) {
        const int MOD = 1e9 + 7;
        int totalSum = 0;
        calculateSum(root, totalSum);
        long long int maxProduct = 1;  
        solve(root, maxProduct, totalSum);
        return maxProduct % MOD;
    }
};