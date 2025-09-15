import unittest

import automatic_bike


class TestPowerButtonFunction(unittest.TestCase):
    def test_that_when_my_bike_was_bought_it_was_off(self):
        result = automatic_bike.set_power(0)
        self.assertFalse(result)
    def test_that_when_i_switch_on_it_comes_up(self):
        result = automatic_bike.set_power(1)
        self.assertTrue(result)


