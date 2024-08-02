import math

def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

n = int(input("Enter the range of Array: "))
a = []

print("Enter the elements of Array: ")
for _ in range(n):
    a.append(int(input()))

print("Prime numbers in the array are: ", end="")
for item in a:
    if prime(item):
        print(item, end=" ")
print()
