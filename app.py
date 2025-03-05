# app.py

def add(a, b):
    """
    2つの数値を足して結果を返す関数
    """
    return a + b

def subtract(a, b):
    """
    2つの数値を引いて結果を返す関数
    """
    return a - b

def multiply(a, b):
    """
    2つの数値を掛けて結果を返す関数
    """
    return a * b

def divide(a, b):
    """
    2つの数値を割って結果を返す関数。
    bが0の場合はValueErrorを発生させる。
    """
    if b == 0:
        raise ValueError("Division by zero is not allowed.")
    return a / b

if __name__ == "__main__":
    print("2 + 3 =", add(2, 3))
    print("5 - 2 =", subtract(5, 2))
    print("3 * 4 =", multiply(3, 4))
    print("10 / 2 =", divide(10, 2))
