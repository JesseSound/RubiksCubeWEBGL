int dim = 3;
Box[][][] cube= new Box[dim][dim][dim];
void setup() {
    size(400,400, P3D);
    for (int i = 0; i<dim; i++){
        for (int j = 0; j<dim; j++){
            for (int k = 0; k<dim; k++){
                float len = 10;
                float x = len * i;
                float y = len * j;
                float z = len * k;
                cube[i][j][k] = new Box( x, y, z, len);
            }
        }
    }
}

void draw () {

}