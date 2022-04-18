def sum_func(num):
    if num:
        return num+sum_func(num-1)
    else:
        return 0

result = sum_func(10)
print("Sum is ",result)