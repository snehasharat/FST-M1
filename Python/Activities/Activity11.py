fruits = { 
    "apple":200, 
    "mango":400, 
    "banana":100, 
    "watermelon":150, 
    "orange":100
    }

check_fruit = input("Enter the fruit you want to check ").lower()


if (check_fruit in fruits):
    print("Yes ", check_fruit, " is available")
else:
    print(check_fruit, "is not available")
