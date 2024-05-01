for (int i = 0; i < 3; i++) {
            try {
                j1.join();
            } catch (Exception e) {
                System.err.println(e);
            }
        }