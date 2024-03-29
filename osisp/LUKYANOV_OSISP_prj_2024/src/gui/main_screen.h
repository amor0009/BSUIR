#ifndef SCREEN_H
#define SCREEN_H
#include "../utility/utility_gui_lib.h"
#include "settings.h"
#include <form.h>
#include <locale.h>
#include "../config.h"
#include "../executor/executor.h"
#include "about.h"

//Основная точка входа в цикл событий программы
void render_main_window_gui();

//Инициализация форм
static void init_form();

//Очистка выделенных ресурсов
static void cleanup();

//Завершающая рутина
static void exit_route();

//Обработчик удаления символа в форме
static void on_del_char_handler();

//Обработчик изменения размера основного окна
static void on_resize_handler();

//Обработчик нажатия клавиши KEY_DOWN
static void on_key_down_handler();

//Обработчик нажатия клавиши KEY_UP
 static void on_key_up_handler();

//Обработчик события перехода к окну "О программе"
static void on_about_handler();

//Отрисовать строку поиска
static void render_search_bar();

//Предварительная инициализация основного окна
static void main_window_gui_init();

//Обработчик события подтверждения ввода в строку поиска
static void on_submit_handler();

//Порядок отрисовки
static void refresher_handler();

//Отрисовать основное окно
static void render_main_window();

//Обработчик события перехода к окну параметров
static void on_settings_handler();

//Обработчик нажатия клавиши KEY_RIGHT
static void on_scroll_right();

//Обработчик нажатия клавиши KEY_LEFT
static void on_scroll_left();
#endif