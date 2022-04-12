numbers = list(input("Enter the list of numbers seperated with comma ").split(","))
print(numbers)

if(numbers[0] == numbers[-1]):
    print(True)
else:
    print(False)