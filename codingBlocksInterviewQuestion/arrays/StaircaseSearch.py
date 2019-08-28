# Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

# Integers in each row are sorted from left to right.
# The first integer of each row is greater than the last integer of the previous row.
# Example 1:

# Input:
# matrix = [
#   [1,   3,  5,  7],
#   [10, 11, 16, 20],
#   [23, 30, 34, 50]
# ]
# target = 3
# Output: true
# Example 2:

# Input:
# matrix = [
#   [1,   3,  5,  7],
#   [10, 11, 16, 20],
#   [23, 30, 34, 50]
# ]
# target = 13
# Output: false
class Solution(object):
    def searchMatrix(self, matrix, target):
        if(len(matrix) <= 0 or len(matrix[0])<=0):
            return False
        key = matrix[0][len(matrix[0])-1]
        number_of_rows = 0
        number_of_columns = len(matrix[0])
        row_index = 0
        column_index = len(matrix[0])-1
        while (number_of_rows < len(matrix) and number_of_columns>0):
            key = matrix[row_index][column_index]
            if (key == target) :
                return True
            elif (key > target) :
                number_of_columns = number_of_columns -1
                column_index = column_index-1
                
            else :
                number_of_rows = number_of_rows +1
                row_index = row_index+1
        return False
                
                
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """