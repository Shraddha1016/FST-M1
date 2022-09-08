fruit_shop = {
    "apple": 34,
    "banana": 20,
    "orange": 90,
    "peaches": 10
}
key_to_check = input("What are you looking for? ").lower()
if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")