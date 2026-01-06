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
    int maxLevelSum(TreeNode* root) {
        int maxSum = INT_MIN;
        int ans = 0, level = 0;
        queue<TreeNode *> q;
        q.push(root);
        while(!q.empty()){
            level++;
            int sumAtCurrentLevel = 0;
            for (int i = q.size(); i > 0; i--){
                TreeNode* node = q.front();
                q.pop();
                sumAtCurrentLevel += node->val;
                if (node->left != nullptr){
                    q.push(node->left);
                }
                if (node->right != nullptr){
                    q.push(node->right);
                }
            }
            if (maxSum < sumAtCurrentLevel){
                maxSum = sumAtCurrentLevel;
                ans = level;
            }
        }
        return ans;
    }
};