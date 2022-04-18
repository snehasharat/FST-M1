def sum_func(num_list):
    result = 0
    for num in num_list:
        result = result+num
    return result

list1 = [2, 6, 7, 4, 1]
total = sum_func(list1)
print ("Sum of all numbers in list is ", total)