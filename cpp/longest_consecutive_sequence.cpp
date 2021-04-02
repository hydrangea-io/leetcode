#include "unionfind.hpp"

/**
 * LeetCode 128. Longest Consecutive Sequence.
 * Given an unsorted array of integers 'nums', return the length of the
 * longest consecutive elements sequence.
 *
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * 
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
class LongestConsecutiveSequence {
private:
    bool arrayContains(vi& arr, int num) {
        for (auto i : arr) {
            if (i == num) return true;
        }
        return false;
    }
public:
    /**
     * The brute force algorithm does not do anything clever - it just considers
     * each number in 'nums', 
     */
    int bruteForce(vi& nums) {
        int longestStreak = 0;
        for (auto num : nums) {
            int currentNum = num;
            int currentStreak = 1;
            while (arrayContains(nums, currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }
            longestStreak = std::max(longestStreak, currentStreak);
        }
        return longestStreak;
    }
};

int main() {
    LongestConsecutiveSequence s;
    vi nums { 1, 2, 3, 4, 10 };
    int result = s.bruteForce(nums);
    std::cout << result << std::endl;
    return 0;
}