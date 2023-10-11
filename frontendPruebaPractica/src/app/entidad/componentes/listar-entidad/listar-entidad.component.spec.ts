import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarEntidadComponent } from './listar-entidad.component';

describe('ListarEntidadComponent', () => {
  let component: ListarEntidadComponent;
  let fixture: ComponentFixture<ListarEntidadComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarEntidadComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarEntidadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
