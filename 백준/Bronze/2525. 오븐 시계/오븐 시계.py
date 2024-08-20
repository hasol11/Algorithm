#A시간, B분을 동시에 받고, 다른 변수에 추가된 C분 입력 받기
#B+C 를 한 값의 몫과 나머지를 구해서 몫을 시간에 더하고, 나머지를 분에 더하기
A,B=input().split()
C=input()
A=int(A)
B=int(B)
C=int(C)

can=(C+B)//60+A
if can>=24:
    can=can-24
can1=(C+B)%60
print(can,can1)




