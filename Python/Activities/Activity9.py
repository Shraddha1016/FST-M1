listOne = [17, 22, 83, 11, 17]
listTwo = [63, 44, 24, 30, 12]
print("First List ", listOne)
print("Second List ", listTwo)
thirdList = []
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
print("result List is:")
print(thirdList)