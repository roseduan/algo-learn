import turtle

if __name__ == '__main__':
    turtle.speed(12)
    turtle.penup()

    x, y = -270, -180
    width, height = 540, 360

    turtle.goto(x, y)
    turtle.pencolor('black')
    turtle.fillcolor('red')

    turtle.begin_fill()
    for i in range(2):
        turtle.forward(width)
        turtle.left(90)
        turtle.forward(height)
        turtle.left(90)
    turtle.end_fill()

    pice = 22

    center_x, center_y = x + 5 * pice, y + height - pice * 5
    turtle.goto(center_x, center_y)

    turtle.mainloop()
