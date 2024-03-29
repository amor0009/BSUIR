#ifndef ABOUT_H
#define ABOUT_H
#include "../utility/utility_gui_lib.h"
#include "settings.h"

//Точка входа в обработчик событий окна "О программе"
void about();

//Обработчик отрисовки окна "О программе"
static void render_about_window();

//Обработчик события изменения размера окна
static void on_about_resize_handler();

//Обработчик события выхода в основное окно
static void on_about_exit_handler();

//Порядок отрисовки окна "О программе"
static void about_refresher_handler();
#endif