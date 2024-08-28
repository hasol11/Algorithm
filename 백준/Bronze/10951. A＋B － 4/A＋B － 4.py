while True:
    try:
        user_input = input()
        if not user_input:  # 입력이 없을 경우 빈 문자열을 반환하므로, 이를 체크
            break
        A, B = user_input.split()
        A = int(A)
        B = int(B)
        print(A + B)
    except EOFError:  # EOFError 발생 시 반복문 종료
        break
