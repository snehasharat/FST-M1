import pytest
import math

def test_sum():
    num1=10
    num2=20

    sum = num1+num2 
    assert sum == 30

def test_sub():
    num1 = 30
    num2 = 10

    sub = num1 - num2
    assert sub == 20

def test_multiply():
    num1 = 2
    num2 = 6

    mul = num1 * num2
    assert mul == 12

def test_divide():
    num1 = 30
    num2 = 10

    div = num1 / num2
    assert div == 3
