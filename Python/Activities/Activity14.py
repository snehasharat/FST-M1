def fibonnaci(num):
    if(num<=1):
        return num
    else:
        return (fibonnaci(num-1)+fibonnaci(num-2))


number = int(input("Enter a number to generate fibonnaci sequece "))

for n in range(number):
    print(fibonnaci(n))
    