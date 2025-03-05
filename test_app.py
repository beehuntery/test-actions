# test_app.py
import pytest
from app import add, subtract, multiply, divide

def test_add():
    assert add(2, 3) == 5
    assert add(-1, 1) == 0
    assert add(0, 0) == 0

def test_subtract():
    assert subtract(10, 5) == 5
    assert subtract(0, 5) == -5
    assert subtract(-3, -3) == 0

def test_multiply():
    assert multiply(4, 5) == 20
    assert multiply(0, 100) == 0
    assert multiply(-2, 3) == -6

def test_divide():
    assert divide(10, 2) == 5
    assert divide(9, 3) == 3
    with pytest.raises(ValueError) as exc_info:
        divide(5, 0)
    assert "Division by zero is not allowed." in str(exc_info.value)

def test_combined_operations():
    # 複数の関数を組み合わせた動作確認
    result = add(multiply(2, 3), subtract(10, 4))  # 2*3 + (10-4) = 6 + 6 = 12
    assert result == 12
