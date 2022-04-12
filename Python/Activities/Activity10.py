ex_tuple = tuple(input("Enter the numbers seperated by comma : ").split(","))
print ("Entered tuple is ", ex_tuple)

for num in ex_tuple:
    if(int(num)%5 == 0):
        print (num)