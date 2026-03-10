import hashlib
line=input("Enter the string to be hashed: ")
hash_object = hashlib.md5(line.encode()).hexdigest()
print(hash_object)