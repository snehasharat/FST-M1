list1 = [72, 61, 43, 0, 9, 1]
list2 = [12, 9, 4, 22, 11, 29]

print("First list \n", list1)
print("Second list \n", list2)

newlist = []
for num in list1:
    if(num%2 == 1):
        newlist.append(num)

for num in list2:
    if(num%2 == 1):
        newlist.append(num)


print ("New list is ", newlist)