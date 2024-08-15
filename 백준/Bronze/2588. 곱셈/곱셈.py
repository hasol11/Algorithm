first=int(input())
second=int(input())
first_1=first%10
first_2=(first%100)//10
first_3=first//100
second_1=second%10
second_2=(second%100)//10
second_3=second//100


a=second_1*first_1+second_1*first_2*10+second_1*first_3*100
b=second_2*first_1+second_2*first_2*10+second_2*first_3*100
c=second_3*first_1+second_3*first_2*10+second_3*first_3*100
print(a)
print(b)
print(c)
print(a+b*10+c*100)